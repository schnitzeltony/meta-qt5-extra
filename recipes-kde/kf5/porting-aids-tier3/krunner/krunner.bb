SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999 \
"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ebc23e7ff249c7b1a2c95175d1c0f7bc"
SRC_URI[sha256sum] = "90532e715fe9d133efd8c299c5d3bdffa74ce56bcf36d36284461bae9e291a70"

CMAKE_HIDE_ERROR[1] = "KF5Runner, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Runner, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/qml/org/kde"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/*/.debug"
