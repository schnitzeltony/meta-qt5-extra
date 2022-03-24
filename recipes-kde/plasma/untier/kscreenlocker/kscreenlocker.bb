SUMMARY = "Library and components for secure lock screen architecture"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

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
    layer-shell-qt \
    libxcb \
    systemd \
    qtx11extras \
    libxcursor \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'libpam', '', d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "wayland-native", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "03157ca122085fd6d8eeabb369c363ef706a773ad509eb5c08722a0e4bf903b6"
SRC_URI += "file://kde.pam"

do_install:append() {
    install -d ${D}${sysconfdir}/pam.d
    install -m 644 ${WORKDIR}/kde.pam ${D}${sysconfdir}/pam.d/kde
}

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kconf_update \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    ${datadir}/plasma \
    ${datadir}/ksmserver \
    ${sysconfdir} \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS:${PN} += "perl"
