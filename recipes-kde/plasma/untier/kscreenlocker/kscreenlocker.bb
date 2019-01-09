SUMMARY = "Library and components for secure lock screen architecture"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kpackage-native \
    sonnet-native \
    plasma-framework \
    kcmutils \
    kdeclarative \
    kidletime \
    kdelibs4support \
    kcrash \
    kglobalaccel \
    libxcb \
    systemd \
    qtx11extras \
    libxcursor \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'libpam', '', d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "wayland-native", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "78df406490d960548b085bcc8d32afbd"
SRC_URI[sha256sum] = "d594896c8d7c5181f157b2f2eb25b0b4063d221696b730e72edc4cf0efc95599"

SRC_URI += "file://kde.pam"

do_install_append() {
    install -d ${D}${sysconfdir}/pam.d
    install -m 644 ${WORKDIR}/kde.pam ${D}${sysconfdir}/pam.d/kde
}

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kconf_update \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/ksmserver \
    ${sysconfdir} \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
