inherit kde-base

PLASMA_VERSION = "5.14.5"

SRC_URI = "${KDE_MIRROR}/stable/plasma/${PV}/${BPN}-${PV}.tar.xz"

DEPENDS += " \
    kwayland \
"
