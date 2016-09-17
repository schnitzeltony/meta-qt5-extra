SUMMARY = "KINFOCENTER"
LICENSE = "GPLv2 & LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

DEPENDS += " \
    pciutils \
    kcompletion \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    kcmutils \
    kdelibs4support \
    kio \
    kservice \
    solid \
    kwidgetsaddons \
    kxmlgui \
"

# REVISIT optionals
DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "fc46dfdd8f502f8dc437d9abc0324f32"
SRC_URI[sha256sum] = "f9cdf5575d332c4bd7f46238d3cd957a27b534a0e163d58fc7844bbc65115238"
SRC_URI += "file://0001-fix-build-in-x11-less-environments.patch"

FILES_${PN} += " \
    ${datadir}/kcmusb \
    ${datadir}/desktop-directories \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
