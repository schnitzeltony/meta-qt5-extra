SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/service/Activities.h;endline=18;md5=32a623707dcb9832168ad37f924f5745 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8d542381ec2d40deb60d562474bd2960"
SRC_URI[sha256sum] = "534b79658d0cbb58e599ea2dadc9fe364c8279ac2895ab536a9f2c98b6f44c34"

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
