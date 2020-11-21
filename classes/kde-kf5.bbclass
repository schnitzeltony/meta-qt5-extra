inherit kde-base

KF5_VERSION = "5.76.0"

def kde_verdir(v):
    return oe.utils.trim_version(v, 2)

KF5_VERSION_DIR = "${@kde_verdir("${KF5_VERSION}")}"

SRC_URI = "${KDE_MIRROR}/stable/frameworks/${KF5_VERSION_DIR}/${BPN}-${PV}.tar.xz"
