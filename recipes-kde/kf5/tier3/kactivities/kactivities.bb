SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2 & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui kio kdbusaddons kdeclarative kcmutils"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ef38903e74bb1afafb99be31204c6c38"
SRC_URI[sha256sum] = "d3b3e5f339429be8dd8969e0027dbb698198df64015e990e5acd39b54d3d5926"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Activities, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Activities, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
"
