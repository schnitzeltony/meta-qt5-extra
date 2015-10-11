SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/service/Activities.h;endline=18;md5=32a623707dcb9832168ad37f924f5745 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1c4bf1f81a246a8227afbd184375c8bc"
SRC_URI[sha256sum] = "d8d2603b212081a7137b0647d4e0177f7f50034426c0dbb392e5978c1c3a2e41"

SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Activities, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Activities, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
"
