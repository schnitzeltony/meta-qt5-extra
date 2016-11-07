SUMMARY = "Linux multitouch gesture recognizer"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=39bba7d2cf0ba1036f2a6e2be52fe3f0"

inherit qmake5

DEPENDS += "qtbase qtx11extras geis"

SRC_URI = " \
    git://github.com/JoseExposito/touchegg.git \
    file://0001-fix-qt5-build.patch \
"
PV = "1.1.1+git${SRCPV}"
SRCREV = "3a768ebfdc5f89a603504428705f80795d2ccc26"
S="${WORKDIR}/git"

FILES_${PN} += "${datadir}/touchegg"
