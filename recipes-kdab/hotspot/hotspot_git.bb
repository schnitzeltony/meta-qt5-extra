SUMMARY = "The Linux perf GUI for performance analysis"
LICENSE = "GPL-2.0-or-later | KDAB-Commercial | KDAB-Commercial-US"
LIC_FILES_CHKSUM = " \
    file://LICENSE.txt;md5=50a9af6464b390664488e7af1cc5c148 \
    file://LICENSE.GPL.txt;md5=8b7a65584aeb92995bcb6066ed0f58f7 \
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
SRC_URI = "gitsm://github.com/KDAB/hotspot.git;protocol=https;branch=master"
SRCREV = "35d1865babf40b9df454810ca8cc09e77b0c349a"
S = "${WORKDIR}/git"
PV = "1.2.0+git${SRCPV}"

FILES:${PN} += "${datadir}/icons"

RDEPENDS:${PN} += "perf"
