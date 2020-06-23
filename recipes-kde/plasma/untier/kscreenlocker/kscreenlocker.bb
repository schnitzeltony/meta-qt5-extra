SUMMARY = "Library and components for secure lock screen architecture"
LICENSE = "GPLv2"
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
    libxcb \
    systemd \
    qtx11extras \
    libxcursor \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'libpam', '', d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "wayland-native", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "78cc25b7d25f0bc39b1973a041171c54"
SRC_URI[sha256sum] = "a77959b0faefda4b832794761f739cf0416a16674bc80ffbc4c56b71b25d438b"

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

RDEPENDS_${PN} += "perl"
