inherit kde-base

KDE_APP_VERSION = "20.12.0"

#SRC_URI = "${KDE_MIRROR}/stable/applications/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI = "${KDE_MIRROR}/stable/release-service/${PV}/src/${BPN}-${PV}.tar.xz"

RRECOMMENDS_${PN} += "qtbase-plugins"
