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
SRC_URI[md5sum] = "876a27db04ac8d957c62779dfa8f81e4"
SRC_URI[sha256sum] = "6a894457adb38a6042d429196e6f3fa3d6fe1dd7f09af2a1cb870c8b6fc98be7"
SRC_URI += "file://0001-CMakeLists.txt-add-an-option-BUILD_KGDECLARATIVE-dis.patch"

PACKAGECONFIG[kgdeclarative] = "-DBUILD_KGDECLARATIVE=Yes,-DBUILD_KGDECLARATIVE=No, kdeclarative"
PACKAGECONFIG ??= ""

FILES_${PN} += " \
    ${datadir}/carddecks \
    ${datadir}/kconf_update \
    ${libdir}/${QT_DIR_NAME}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/qml/*/*/*/*/.debug \
"

CMAKE_ALIGN_SYSROOT[1] = "KF5KDEGames, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5KDEGames, -S${includedir}, -S${STAGING_INCDIR}"
