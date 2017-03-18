inherit kde-base

KDE_APP_VERSION = "16.12.3"

SRC_URI = "${KDE_MIRROR}/stable/applications/${PV}/src/${BPN}-${PV}.tar.xz"

RRECOMMENDS_${PN} += "qtbase-plugins"
