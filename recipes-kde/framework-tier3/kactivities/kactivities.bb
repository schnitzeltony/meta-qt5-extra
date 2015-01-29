SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/service/common.h;endline=18;md5=c6cc045ed732acc1204af0c74a0418b0 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

SRCREV = "26fbf4fab77f3458893715541f3abae5743ad59c"
SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Activities, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Activities, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/plugins ${libdir}/qml/org/kde"
FILES_${PN}-dbg += "${libdir}/plugins/.debug ${libdir}/plugins/*/.debug ${libdir}/qml/org/kde/*/.debug"
