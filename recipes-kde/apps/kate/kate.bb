SUMMARY = "An advanced editor component which is used in numerous KDE applications requiring a text editing component"
LICENSE = "GPLv2 & LGPLv3 & GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=334069b3769dfd935f3e668e638a26ad \
    file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-apps gettext

DEPENDS += " \
    qtscript \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    sonnet-native \
    kdoctools-native \
    kpackage-native \
    kguiaddons \
    ki18n \
    kinit \
    kjobwidgets \
    kio \
    kparts \
    ktexteditor \
    kwindowsystem \
    kxmlgui \
    kitemmodels \
    threadweaver \
    plasma-framework \
    knewstuff \
    kiconthemes \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "5e26a400aa91c1408b19233019cd2bf5"
SRC_URI[sha256sum] = "7b058db1a38d031262ded02d1a230fdb6c2447629d4a82d42631f615897ddea2"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch \
    file://0002-fix-build-for-sessionless-kconfig.patch \
"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kateproject \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/katexmltools \
    ${datadir}/icons \
    \
    ${libdir}/libkdeinit5*.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
"
