SUMMARY = "An advanced editor component which is used in numerous KDE applications requiring a text editing component"
LICENSE = "GPLv2 & LGPLv3 & GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=334069b3769dfd935f3e668e638a26ad \
    file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-apps

DEPENDS += " \
    qtscript \
    \
    kconfig \
    kdoctools \
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
SRC_URI[md5sum] = "b2205046a00b849617a416da677fa972"
SRC_URI[sha256sum] = "34eee6c384e2c2776c7d0ab65e7217e730cdbdecb82578c9dc90380cb82affd2"

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
