SUMMARY = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv3 | GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri distro_features_check cmake_auto_align_paths cmake_lib

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.9.0.1+git${SRCPV}"

SRCREV = "716c764b546b8bed0d6cd33acb5c684b831b1daa"
S = "${WORKDIR}/git"

DEPENDS += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xcb-util-cursor libxcursor', '', d)} \
    wayland \
    qtwayland \
    qtwayland-native \
    glib-2.0 \
    virtual/egl \
    libinput \
"

PACKAGECONFIG ??= " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "xwayland", "",d)} \
"
PACKAGECONFIG[kms] = "-DENABLE_EGLDEVICEINTEGRATION_KMS:BOOL=ON,-DENABLE_EGLDEVICEINTEGRATION_KMS:BOOL=OFF,drm virtual/egl"
PACKAGECONFIG[brcm] = "-DENABLE_EGLDEVICEINTEGRATION_BRCM:BOOL=ON -DBcmHost_PREFIX:PATH=/usr,-DENABLE_EGLDEVICEINTEGRATION_BRCM:BOOL=OFF,virtual/egl"
PACKAGECONFIG[protocols] = "-DUSE_LOCAL_WAYLAND_PROTOCOLS:BOOL=OFF,-DUSE_LOCAL_WAYLAND_PROTOCOLS:BOOL=ON,wayland-protocols"
PACKAGECONFIG[xwayland] = "-DENABLE_XWAYLAND:BOOL=ON,-DENABLE_XWAYLAND:BOOL=OFF,libxcb xserver-xorg,xserver-xorg-xwayland"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "LiriPlatform, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "LiriPlatform, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "LiriWaylandClient, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[4] = "LiriWaylandServer, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/Liri \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_QML}/Liri/*/.debug \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
    ${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs \
"
