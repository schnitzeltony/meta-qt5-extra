SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/service/Activities.h;endline=18;md5=32a623707dcb9832168ad37f924f5745 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "984c74b7ef242703990caa8b2a0b187e"
SRC_URI[sha256sum] = "b95e76570963a9f8797f103e32ddf58382c104e935fc27de3f48eea3db300a5b"

SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Activities, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Activities, -S${includedir}, -S${STAGING_INCDIR}"

FILES_SOLIBSDEV = "${libdir}/libKF5Activities*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/libkactivitymanagerd_plugin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/*/.debug \
"
