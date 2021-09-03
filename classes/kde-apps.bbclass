inherit kde-base

KDE_APP_VERSION = "21.08.1"

SRC_URI = "${KDE_MIRROR}/stable/release-service/${PV}/src/${BPN}-${PV}.tar.xz"

RRECOMMENDS:${PN} += "qtbase-plugins"
