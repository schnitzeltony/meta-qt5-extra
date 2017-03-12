SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtxmlpatterns syntax-highlighting karchive kconfig kguiaddons ki18n kio kparts sonnet libgit2"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a0348d81e31e412d7ee03b4085e47983"
SRC_URI[sha256sum] = "fc4951138802455f5df773a918d725162febcf0e650d888b66d50c3726e2cbeb"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/parts/.debug \
"
