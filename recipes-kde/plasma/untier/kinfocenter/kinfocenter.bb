SUMMARY = "KINFOCENTER"
# Have no idea how kinfocenter is licensed now (and change came in with minor
# point release !!)
# [1] https://cgit.kde.org/kinfocenter.git/commit/?id=4ea9df96ae038f28f3e9f6ecef6a64681bb3e189
LICENSE = "GPLv2 & LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GFDL-1.2-only.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
"

inherit kde-plasma gettext

DEPENDS += " \
    pciutils \
    kcompletion \
    kauth-native \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools \
    kdoctools-native \
    ki18n \
    kiconthemes \
    kcmutils \
    kpackage-native \
    sonnet-native \
    kio \
    kservice \
    solid \
    kwidgetsaddons \
    kxmlgui \
"

# REVISIT optionals
DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0b6be07f771fe18b99c41b8a434aa651"
SRC_URI[sha256sum] = "e7f263db54bb0826605f6353636d502906c86104e1e9686c61b582208177e16f"
SRC_URI += "file://0001-fix-build-in-x11-less-environments.patch"

FILES_${PN} += " \
    ${datadir}/kcmusb \
    ${datadir}/desktop-directories \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
"
