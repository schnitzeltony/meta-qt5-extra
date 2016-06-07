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
SRC_URI[md5sum] = "a6c41e3ca997e878c6bc354fe854d10b"
SRC_URI[sha256sum] = "799acd58d0feffea63d2ea09cf183a6205c549452669bf5764f0104e0d831219"

do_compile_prepend() {
    # Error: Could not locate service type file kservicetypes5/ "kfileitemactionplugin.desktop" , tried ...
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

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
