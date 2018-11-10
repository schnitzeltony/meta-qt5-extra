SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPLv2 & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5

DEPENDS += "boost kconfig kcoreaddons ki18n kservice kwindowsystem kglobalaccel kxmlgui \
            kio kdbusaddons kdeclarative kcmutils kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "242b533d6f2511581bb429250685162e"
SRC_URI[sha256sum] = "add14c6331d4a282ca8313a5a931f111cb85efaf13079035428c50e2f65c935d"

do_compile_prepend() {
    # Error: Could not locate service type file kservicetypes5/ "kfileitemactionplugin.desktop" , tried ...
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

RDEPENDS_${PN} += "kactivitymanagerd"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
"
