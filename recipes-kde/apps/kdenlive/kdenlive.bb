SUMMARY = "Kdenlive is an intuitive and powerful multi-track video editor"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=38adfe5a9f2953129da1774430b28adf \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    mlt \
    qtsvg \
    qtwebkit \
    karchive \
    kauth-native \
    sonnet-native \
    kbookmarks \
    kcoreaddons-native \
    kconfig-native \
    kconfigwidgets \
    kdbusaddons \
    kfilemetadata \
    kio \
    kwidgetsaddons \
    kplotting \
    knotifyconfig \
    knewstuff \
    kxmlgui \
    knotifications \
    kguiaddons \
    ktextwidgets \
    kiconthemes \
    kdoctools-native \
    xapian-core \
    purpose \
    shared-mime-info-native \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "e5c76b3593f4420987e1c156afd056ac"
SRC_URI[sha256sum] = "4e2e513a6a71597e784add11133f51d0f0a96b05b0061f9bee6aba4ab10637a1"

SRC_URI += " \
    file://0001-CMakeLists.txt-make-MLT_PREFIX-configurable.patch \
"

EXTRA_OECMAKE += "-DMLT_PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/mime \
    ${datadir}/menu \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"

RRECOMMENDS_${PN} += "ffmpeg"
