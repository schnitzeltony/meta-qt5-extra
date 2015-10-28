SUMMARY = "Common code and data for many KDE games"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps cmake-lib

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
SRC_URI[md5sum] = "1227b0fc824834e9ed4fc899a4a6c6cd"
SRC_URI[sha256sum] = "b9de55aec10aca575592805d1da8160d04c247636d8f2b0f82085ab9282a1508"
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

CMAKE_ALIGN_SYSROOT[1] = "KF5KDEGames, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5KDEGames, -S${includedir}, -S${STAGING_INCDIR}"
