SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/service/Activities.h;endline=18;md5=32a623707dcb9832168ad37f924f5745 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7954aea54892c41e339a00f19d7e324c"
SRC_URI[sha256sum] = "55d19bbb9a67d00b0623e077a50f46358045f36fe4d4c6d66af0d6e565faf052"

SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Activities, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Activities, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/plugins ${libdir}/qml/org/kde"
FILES_${PN}-dbg += "${libdir}/plugins/.debug ${libdir}/plugins/*/.debug ${libdir}/qml/org/kde/*/.debug"
