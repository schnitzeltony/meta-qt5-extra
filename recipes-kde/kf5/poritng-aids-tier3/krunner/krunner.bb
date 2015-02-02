SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999 \
"
require ../../kf5-version.inc

inherit kde cmake-lib

SRCREV = "f79f3177cc5ea057e128be791c3cbe198f18038f"
S = "${WORKDIR}/git"

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

CMAKE_HIDE_ERROR[1] = "KF5Runner, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Runner, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/qml/org/kde"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/*/.debug"
