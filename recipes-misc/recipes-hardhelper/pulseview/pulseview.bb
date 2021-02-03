DESCRIPTION = "PulseView is a Qt based logic analyzer, oscilloscope and MSO GUI for sigrok."
HOMEPAGE = "http://sigrok.org/wiki/Main_Page"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = " \
    boost \
    qttools-native \
    qttools \
    qtbase \
    qtsvg \
    libsigrok \
"

PACKAGECONFIG[decode] = "-DENABLE_DECODE=TRUE,-DENABLE_DECODE=FALSE,libsigrokdecode"

PACKAGECONFIG ??= "decode"

inherit cmake_qt5 mime-xdg

SRC_URI = "git://github.com/sigrokproject/pulseview.git"
SRCREV = "89b7b94a048ec53e82f38412a4b65cabb609f395"
PV = "0.4.2+git${SRCPV}"
S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/*"
