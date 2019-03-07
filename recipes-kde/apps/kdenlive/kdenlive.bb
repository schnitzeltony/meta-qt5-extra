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
SRC_URI[md5sum] = "57e49c3995117945938669e24aff9352"
SRC_URI[sha256sum] = "fcfe2474bc271e730ed95edb21ae46e93c1ce773ed036f63c9fb2db02cbc7e64"

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

RRECOMMENDS_${PN} += "ffmpeg"
