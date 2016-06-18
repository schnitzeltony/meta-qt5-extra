SUMMARY = "KDE's terminal emulator"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2 & MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.Unicode;md5=ca09fbc4ba99ecc01ce41d513908dcd3 \
"

inherit kde-apps

DEPENDS += " \
    kbookmarks \
    kcompletion \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdoctools \
    kguiaddons \
    ki18n \
    kiconthemes \
    kinit \
    kdelibs4support \
    kio \
    knotifications \
    knotifyconfig \
    kparts \
    kpty \
    kservice \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"


PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "701b81cdb0d9c1cb86ff8627faf2d9e5"
SRC_URI[sha256sum] = "29dcfc6229dfc83e81b5bd8133abc57d9135ff38ea31682d997c8b43a0ebe7de"
SRC_URI += "file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/appdata \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/libkdeinit5_konsole.so \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
