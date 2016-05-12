SUMMARY = "Library and components for secure lock screen architecture"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check cmake-lib

DEPENDS += " \
    plasma-framework \
    kcmutils \
    kdeclarative \
    kidletime \
    kdelibs4support \
    kcrash \
    kglobalaccel \
    libxcb \
    qtx11extras \
    kwayland \
    wayland \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "3df10c588206b4cfa52bab047c84265d"
SRC_URI[sha256sum] = "104c31bc886358273bfab2f2605fbfb8a1030046b64611483ca1835ce865d02a"

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

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KScreenLocker, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KScreenLocker, -S${includedir}, -S${STAGING_INCDIR}"
