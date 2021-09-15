SUMMARY = "Runtime and library to organize the user work in separate activities"
LICENSE = "GPL-2.0+ & LGPL-2.0+ & LGPL-2.1 & LGPL-3.0 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += " \
    boost \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kconfig \
    kcoreaddons \
    ki18n \
    kservice \
    kwindowsystem \
    kglobalaccel \
    kxmlgui \
    kio \
    kdbusaddons \
    kdeclarative \
    kcmutils \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "65d0b354b0f2fc51eaed94d64a7549ebec8f57a4de807a14799d3781fb2cb7e6"

do_compile:prepend() {
    # Error: Could not locate service type file kservicetypes5/ "kfileitemactionplugin.desktop" , tried ...
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

RDEPENDS:${PN} += "kactivitymanagerd"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
