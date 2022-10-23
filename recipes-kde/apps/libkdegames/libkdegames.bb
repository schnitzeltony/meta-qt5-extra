SUMMARY = "Common code and data for many KDE games"
LICENSE = "BSD-2-Clause & BSD-3-Clause & GFDL-1.2+ & GPL-2.0-or-later & ISC & LGPL-2.0-only & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/ICS.txt;md5=1108ca4f15e2e55accf0f66de647cfd6 \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
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
SRC_URI[sha256sum] = "524ad11b13ac946d86e599a7a255b651f9377fad4433a4ec22924c8f54cc6dbd"

FILES:${PN} += " \
    ${datadir}/carddecks \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_QML} \
"
