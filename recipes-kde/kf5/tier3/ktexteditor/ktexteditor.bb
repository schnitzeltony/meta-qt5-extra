SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtxmlpatterns syntax-highlighting karchive kconfig kguiaddons ki18n kio kparts sonnet libgit2"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0aa214089e2099767e2a29016e9214a3"
SRC_URI[sha256sum] = "dadaa7521e88653468d6d00933e698031e4822b4bd1bc3c72dc9df3a1d660b2e"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/parts/.debug \
"
