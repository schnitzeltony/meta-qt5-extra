DESCRIPTION = "Python 3 compatible Python 2 `random` Module"
HOMEPAGE = "https://pypi.org/project/random2/"
LICENSE = "PSF-2.0"

LIC_FILES_CHKSUM = "file://setup.py;beginline=13;endline=13;md5=7767ca95316ceeac60eda07a2f2245ca"

SRC_URI = "https://files.pythonhosted.org/packages/ee/b5/5aca5217501fbd06b1e5aed6d5986baa0da5380880e6bb6f421ed18e3a32/random2-${PV}.zip"
SRC_URI[sha256sum] = "34ad30aac341039872401595df9ab2c9dc36d0b7c077db1cea9ade430ed1c007"
S = "${WORKDIR}/random2-${PV}"

inherit setuptools3

PIP_INSTALL_PACKAGE = "random2"

BBCLASSEXTEND = "native"
