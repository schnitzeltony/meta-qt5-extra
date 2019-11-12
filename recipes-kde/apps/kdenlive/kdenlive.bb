SUMMARY = "Kdenlive is an intuitive and powerful multi-track video editor"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=38adfe5a9f2953129da1774430b28adf \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    shared-mime-info-native \
    kpackage-native \
    kcoreaddons-native \
    kdoctools-native \
    kauth-native \
    mlt \
    qtsvg \
    qtwebkit \
    karchive \
    sonnet-native \
    kbookmarks \
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
    xapian-core \
    purpose \
    kdeclarative \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "1d24264b2a20d8a14fa601c626f72a6d"
SRC_URI[sha256sum] = "64ab3cf06222b95f021941d8c430c70918c04c3ea988f7ccf5ef87c6b69b4465"

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
