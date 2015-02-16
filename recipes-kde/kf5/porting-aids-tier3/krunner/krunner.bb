SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999 \
"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "53a16b6cc0a3c8f4129c030a8041a1f5"
SRC_URI[sha256sum] = "ecac62be93e5ef0bbaf98cbb8f8a546bed4c1e593f5a52f0ec3d70b9ffef6b84"

CMAKE_HIDE_ERROR[1] = "KF5Runner, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Runner, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/qml/org/kde"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/*/.debug"
