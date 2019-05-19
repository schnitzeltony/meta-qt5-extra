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
SRC_URI[md5sum] = "e38977ae6c504a4f092c1c6ad3b6d28a"
SRC_URI[sha256sum] = "5295cfdc392a8146ca9c3822f1250ceaf5b54990d69c2e3dec4b072519a5ce5b"

do_compile_prepend() {
    # Error: Could not locate service type file kservicetypes5/ "kfileitemactionplugin.desktop" , tried ...
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

RDEPENDS_${PN} += "kactivitymanagerd"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
