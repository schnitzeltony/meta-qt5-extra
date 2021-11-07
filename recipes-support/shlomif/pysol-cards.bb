SUMMARY = "Deal PySol FC Cards"
HOMEPAGE = "https://github.com/shlomif/pysol_cards"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5feec56facfce12352e96d26cab9b857"

SRC_URI = "git://github.com/shlomif/pysol_cards.git;branch=master;protocol=https"
SRCREV = "eca7276fced32ab059da82060098ac6a7f19c226"
PV = "0.10.1"
S = "${WORKDIR}/git"

DEPENDS = "python3-pbr-native"

inherit setuptools3

BBCLASSEXTEND = "native"
