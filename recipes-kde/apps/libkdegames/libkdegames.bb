SUMMARY = "Common code and data for many KDE games"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kcoreaddons-native \
    kpackage-native \
    kauth-native \
    kconfig-native \
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
    kparts \
    solid \
    sonnet-native \
    kxmlgui \
    kdoctools \
    kdeclarative \
    \
    openal-soft \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "12c93b172c1228b6fe69cbdec8c052ca"
SRC_URI[sha256sum] = "270b20c902dda233f9b28f67eca582d810693d715ce768da6082bfa375248172"

FILES_${PN} += " \
    ${datadir}/carddecks \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_QML} \
"
