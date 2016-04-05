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
SRC_URI[md5sum] = "173888c9ce09eb9979c90735b0664d65"
SRC_URI[sha256sum] = "3ae7c40c4394c32eafe560694b58aafa841f613451a9543d7fbf5d68e79e4bb2"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kconf_update \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/ksmserver \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KScreenLocker, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KScreenLocker, -S${includedir}, -S${STAGING_INCDIR}"
