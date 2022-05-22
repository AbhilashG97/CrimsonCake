# Enter your code here. Read input from STDIN. Print output to STDOUT
from html.parser import HTMLParser
from html.entities import name2codepoint


class MyHTMLParser(HTMLParser):

    def handle_starttag(self, tag, attrs):
        print(tag)
        for attr in attrs:
            print('-> {} > {}'.format(attr[0], attr[1]))


parser = MyHTMLParser()
N = int(input())

for _ in range(N):
    data = input()
    parser.feed(data)
