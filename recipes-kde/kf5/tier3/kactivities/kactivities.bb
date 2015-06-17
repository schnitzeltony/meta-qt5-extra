SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/service/Activities.h;endline=18;md5=32a623707dcb9832168ad37f924f5745 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "76be53547d8ffc7b0ab34547c3ef3d15"
SRC_URI[sha256sum] = "f8576bd7b0a63d5e745441eef3157751e13c04adcd398ff4daa936f12c5c8726"

SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Activities, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Activities, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${libdir}/${QT_DIR_NAME}/qml/org/kde \
"
FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/.debug \
    ${libdir}/${QT_DIR_NAME}/plugins/*/.debug \
    ${libdir}/${QT_DIR_NAME}/qml/org/kde/*/.debug \
"
