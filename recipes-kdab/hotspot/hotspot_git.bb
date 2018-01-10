SUMMARY = "The Linux perf GUI for performance analysis"
LICENSE = "GPLv2+ | KDAB-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.txt;md5=a6b8a64054f1549420f27724acd2337a \
    file://LICENSE.GPL.txt;md5=eed541e1ee57f0373b3cb5824dfe6b93 \
    file://LICENSE.US.txt;md5=1cf6e30372544be558f7146a7e229cdd \
"

inherit kde-base pkgconfig gettext gtk-icon-cache

DEPENDS += " \
    elfutils \
    ki18n-native \
    kcoreaddons-native \
    kauth-native \
    kconfig-native \
    threadweaver \
    kconfigwidgets \
    kitemviews \
    kitemmodels \
    kio \
    solid \
"
SRC_URI = "gitsm://github.com/KDAB/hotspot.git"
SRCREV = "a41a0a5ba1fead202bfdcb2198f192114d030484"
S = "${WORKDIR}/git"
PV = "1.1.0+git${SRCPV}"

FILES_${PN} += "${datadir}/icons"

RDEPENDS_${PN} += "perf"
