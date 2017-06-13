SUMMARY = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv3 | GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri distro_features_check cmake_auto_align_paths cmake_lib

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.9.0.1+git${SRCPV}"

SRCREV = "1a9c1fd63a46e265f271b54c6042609d58826d3f"
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

# egl packageconfig factored out to make it easy for BSP layers to pick what
# machines need
PACKAGECONFIG_EGL ?= "kms"

PACKAGECONFIG ??= " \
    protocols \
    ${PACKAGECONFIG_EGL} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "xwayland", "",d)} \
"
PACKAGECONFIG[kms] = "-DENABLE_EGLDEVICEINTEGRATION_KMS:BOOL=ON,-DENABLE_EGLDEVICEINTEGRATION_KMS:BOOL=OFF,drm,libgbm"
PACKAGECONFIG[brcm] = "-DENABLE_EGLDEVICEINTEGRATION_BRCM:BOOL=ON -DBcmHost_PREFIX:PATH=/usr,-DENABLE_EGLDEVICEINTEGRATION_BRCM:BOOL=OFF"
PACKAGECONFIG[protocols] = "-DUSE_LOCAL_WAYLAND_PROTOCOLS:BOOL=OFF,-DUSE_LOCAL_WAYLAND_PROTOCOLS:BOOL=ON,wayland-protocols"
PACKAGECONFIG[xwayland] = "-DENABLE_XWAYLAND:BOOL=ON,-DENABLE_XWAYLAND:BOOL=OFF,libxcb xserver-xorg,xserver-xorg-xwayland"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "LiriPlatform, -S${libdir}/lib, -s${OE_QMAKE_PATH_HOST_LIBS}/lib"
CMAKE_ALIGN_SYSROOT[2] = "LiriPlatform, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
CMAKE_ALIGN_SYSROOT[3] = "LiriWaylandClient, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
CMAKE_ALIGN_SYSROOT[4] = "LiriWaylandServer, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/Liri \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_QML}/Liri/*/.debug \
"

FILES_${PN}-dev += " \
    ${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs \
"
