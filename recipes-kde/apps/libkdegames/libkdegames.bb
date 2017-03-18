SUMMARY = "Common code and data for many KDE games"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += "\
    kcoreaddons \
    kconfig \
    kwidgetsaddons \
    kcodecs \
    karchive \
    kdbusaddons \
    kdnssd \
    ki18n \
    kguiaddons \
    kservice \
    kconfigwidgets \
    kitemviews \
    kiconthemes \
    kcompletion \
    kjobwidgets \
    ktextwidgets \
    kglobalaccel \
    kxmlgui \
    kcrash \
    kbookmarks \
    kio \
    knewstuff \
    kdelibs4support \
    kparts \
    solid \
    kxmlgui \
    kdoctools \
    \
    openal-soft \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "d24ac48e0e9c8ab93671af88e91af884"
SRC_URI[sha256sum] = "6315a47c7a8ee78a0bf33762f88c3a9193998807fbf15fa46b99d748403ff870"
SRC_URI += "file://0001-CMakeLists.txt-add-an-option-BUILD_KGDECLARATIVE-dis.patch"

PACKAGECONFIG[kgdeclarative] = "-DBUILD_KGDECLARATIVE=Yes,-DBUILD_KGDECLARATIVE=No, kdeclarative"
PACKAGECONFIG ??= ""

FILES_${PN} += " \
    ${datadir}/carddecks \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/.debug \
"
