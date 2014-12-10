SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/service/common.h;endline=18;md5=c6cc045ed732acc1204af0c74a0418b0 \
"

inherit kde cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

SRCREV = "25f2c49862918f8cdf61d878f13889d6f410d60c"
SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Activities, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Activities, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/plugins ${libdir}/qml/org/kde"
FILES_${PN}-dbg += "${libdir}/plugins/.debug ${libdir}/plugins/*/.debug ${libdir}/qml/org/kde/*/.debug"
