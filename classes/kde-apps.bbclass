inherit kde-base

KDE_APP_VERSION = "16.04.3"

SRC_URI = "${KDE_MIRROR}/stable/applications/${PV}/src/${BPN}-${PV}.tar.xz"

RRECOMMENDS_${PN} += "qtbase-plugins"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/metainfo \
"
