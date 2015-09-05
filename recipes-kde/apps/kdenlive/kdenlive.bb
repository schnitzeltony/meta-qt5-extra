SUMMARY = "Kdenlive is an intuitive and powerful multi-track video editor"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=38adfe5a9f2953129da1774430b28adf \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    mlt \
    qtsvg \
    karchive \
    kbookmarks \
    kcoreaddons \
    kconfig \
    kconfigwidgets \
    kdbusaddons \
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
    kdoctools \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "3a08051a2abfbfe2343df70f06630c4a"
SRC_URI[sha256sum] = "3768ee66dc48bf1a506284e0c39f2e61ca9467a484d50987f3d9c2c1863e4274"

SRC_URI += "file://0001-CMakeLists.txt-make-MLT_PREFIX-configurable.patch"
EXTRA_OECMAKE += "-DMLT_PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/mime \
    ${datadir}/menu \
    ${datadir}/icons \
    ${datadir}/appdata \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
