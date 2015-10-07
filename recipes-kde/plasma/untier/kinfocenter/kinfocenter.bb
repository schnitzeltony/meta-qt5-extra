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
    kwayland \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6714e90d548f37ec32d2cc166c68149c"
SRC_URI[sha256sum] = "187eb50cd473a64e382d5b3e918219e31ed58043b3db6802e0e1870fb5de2bdd"
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
