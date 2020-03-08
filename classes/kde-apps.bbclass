inherit kde-base

KDE_APP_VERSION = "19.12.3"


#SRC_URI = "${KDE_MIRROR}/stable/applications/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI = "${KDE_MIRROR}/stable/release-service/${PV}/src/${BPN}-${PV}.tar.xz"

RRECOMMENDS_${PN} += "qtbase-plugins"
