SUMMARY = "Hawaii desktop environment shell"
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii pythonnative cmake-lib
#inherit systemd

SRC_URI += " \
    file://0001-find-host-s-git.patch \
"
SRCREV = "66f1400c4239f88ad261ee853349e8a4164bd72e"
PV = "0.4.93+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS += " \
    qtwayland-native \
    \
    wayland \
    \
    libqtxdg \
    \
    solid \
    \
    greenisland \
"

# REVISIT optionals
DEPENDS += " \
    alsa-lib \
    pulseaudio \
"

PACKAGECONFIG[nm_qt] = "-DENABLE_NETWORK_MANAGER=OFF,-DENABLE_NETWORK_MANAGER=ON,networkmanager-qt"
PACKAGECONFIG ??= "nm_qt"

# starter scripts rely on bash qdbus catchsegv
RDEPENDS_${PN} = "bash qttools-tools qtwayland-plugins catchsegv"

# REVISIT optionals
RRECOMMENDS_${PN} += " \
    hawaii-wallpapers \
    hawaii-icon-themes \
    weston \
"

FILES_${PN} += " \
    ${datadir} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/plugins \
    ${libdir}/systemd \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/*/.debug \
    ${OE_QMAKE_PATH_QML}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/*/*/*/.debug \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "Hawaii, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "Hawaii, -S${includedir}, -S${STAGING_INCDIR}"

