DESCRIPTION = "PulseView is a Qt based logic analyzer, oscilloscope and MSO GUI for sigrok."
HOMEPAGE = "http://sigrok.org/wiki/Main_Page"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "libsigrok qtbase qtsvg boost"

PACKAGECONFIG[decode] = "-DENABLE_DECODE=TRUE,-DENABLE_DECODE=FALSE,libsigrokdecode"

PACKAGECONFIG ??= "decode"

inherit cmake_qt5

SRC_URI = "http://sigrok.org/download/source/pulseview/pulseview-${PV}.tar.gz"

SRC_URI[md5sum] = "6056c6e42cc6eae094110cac2351558a"
SRC_URI[sha256sum] = "9ee7ce3dd1457c6a5f5e4e9c2469903a1f070ba077ea68535cc29ef1dfac6f2f"

FILES_${PN} += "${datadir}/*"
