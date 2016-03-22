inherit kde-base

KF5_VERSION = "5.19.0"

SRC_URI = "${KDE_MIRROR}/stable/frameworks/5.19/${BPN}-${PV}.tar.xz"

do_compile_prepend() {
    export XDG_DATA_HOME=${STAGING_DATADIR}
}
